require 'json'
require 'net/http'

URL = "http://localhost:8080/klass"
METHODS = {post: Net::HTTP::Post, get: Net::HTTP::Get, put: Net::HTTP::Put, delete: Net::HTTP::Delete}

def request(method, path, params=nil)
  uri = URI(URL+path)
  req = METHODS[method].new(uri)
  puts "\n\n#{req.method} #{req.path}"
  
  req.body = params.to_json  if params
  req['Content-Type'] = 'application/json'

  res = Net::HTTP.start(uri.hostname, uri.port) {|http|
    http.request(req)
  }
  puts res.code
  puts res.body
  res
end


res = request(:post, "/triples", triple: {subject: "subject", predicate: "predicate", object: "object"})

last_id = JSON.parse(res.body)["triple"]["id"]
res = request(:put, "/triples/#{last_id}", triple: {object: "object2"})

last_id = JSON.parse(res.body)["triple"]["id"]
res = request(:get, "/triples/#{last_id}")

last_id = JSON.parse(res.body)["triple"]["id"]
res = request(:delete, "/triples/#{last_id}")

res = request(:post, "/triples#failing", triple: {subject: "subject", predicate: "predicate"})

res = request(:get, "/triples")


