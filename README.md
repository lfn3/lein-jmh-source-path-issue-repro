# Repro for lein-jmh issue

Seems like lein-jmh doesn't respect `:source-paths` in `project.clj`.
`jmh.edn` runs with only source files from under `src` and works fine.
This can be run with `lein jmh`.

`jmh-other-src-files.edn` relies on `more_src/jmh_test_more_src/more_core.clj`.
This can be run with `lein jmh '{:file "jmh-other-src-files.edn"}'` and explodes 
with:
```
java.lang.RuntimeException: value did not resolve to a fn: jmh-test-more-src.more-core/more-gen-fn
```
