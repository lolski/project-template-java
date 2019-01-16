java_library(
    name = "subpackage",
    srcs = glob(["*.java"]),
    visibility = [ "//visibility:public" ]
)

java_test(
    name = "subpackage-test",
    test_class = "grakn.template.java.SubpackageTest",
    srcs = glob(["test/SubpackageTest.java"]),
    deps = [ "//main/subpackage" ],
    visibility = [ "//visibility:public" ]
)