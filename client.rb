require 'json'
require 'net/http'


uri = URI("http://localhost:8080/klass/triples")


puts "CREATE TRIPLE"

req = Net::HTTP::Post.new(uri)
req.body = {
  triple: {
    subject: "subject",
    predicate: "predicate",
    object: "object"
  }
}.to_json
req['Content-Type'] = 'application/json'

res = Net::HTTP.start(uri.hostname, uri.port) {|http|
  http.request(req)
}

puts res.body



puts "CREATE TRIPLE FAILING"

req = Net::HTTP::Post.new(uri)
req.body = {
  triple: {
    predicate: "predicate",
    object: "object"
  }
}.to_json
req['Content-Type'] = 'application/json'

res = Net::HTTP.start(uri.hostname, uri.port) {|http|
  http.request(req)
}

puts res.body