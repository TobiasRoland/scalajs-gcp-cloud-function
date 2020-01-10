# Scala.js example app for GCP Cloud Functions
This is an example 'Hello World' app in Scala that will run on Google Cloud Platform's Cloud Functions and
respond to any HTTP requests with status code `200` and a plaintext body of `Hello World`.

Read more: [GCP Cloud Functions with Scala.js in 10 lines(ish)](https://www.mostly.codes/blog/creating-scalajs-gcp-cloud-functions) 


# To build
```
sbt fullOptJS
```
This will generate a single JS file: `./task/scala-2.12/scalajs-gcp-cloud-function-opt.js`, where
the `helloWorld` function can be invoked from GCP Cloud Functions
