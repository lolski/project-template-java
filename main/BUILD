java_library(
    name = "main",
    srcs = glob(["*.java"]),
    deps = [
        "//common",
        "//main/subpackage",
        "//dependencies/maven/artifacts/com/google/guava",
    ],
    visibility = ["//visibility:public"]
)

java_test(
    name = "main-test",
    test_class = "grakn.template.java.MainTest",
    srcs = ["test/MainTest.java"],
    deps = ["//main"],
    data = ["//:distribution"]
)