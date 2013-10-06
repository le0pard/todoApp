(function(requirejs) {
  "use strict";

  // -- PROD RequireJS config --
  requirejs.config({
    packages: ["common", "main"],
    shim: {
      "_" : {},
      "jquery": {
        exports: "$"
      }
    },
    paths: {
      // Map the dependencies to CDNs or WebJars directly
      "_" : "//cdnjs.cloudflare.com/ajax/libs/underscore.js/1.5.1/underscore-min",
      // Use webjars javascrips as a fallback
      "jquery": ["//code.jquery.com/jquery-2.0.3.min", "/webjars/jquery/2.0.3/jquery.min"],
    }
  });

  requirejs.onError = function(err) {
    console.log(err);
  };

  // Make sure generic external scripts are loaded
  /*
  require(["angular", "app", "angular-cookies", "jquery", "bootstrap"], function(angular, app) {
    angular.bootstrap(document, ["app"]);
  });
  */
})(requirejs);