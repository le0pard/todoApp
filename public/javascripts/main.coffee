require.config
  shim:
    "_": {}
    jquery:
      exports: "$"
    requestInspector:
      deps: ["jquery"]
      exports: "requestInspector"
  paths:
    "_" : "//cdnjs.cloudflare.com/ajax/libs/underscore.js/1.5.1/underscore-min"
    "jquery": ["//code.jquery.com/jquery-2.0.3.min", "/webjars/jquery/2.0.3/jquery.min"]

require ["requestInspector"], (requestInspector) ->
  $ ->
    requestInspector.init()