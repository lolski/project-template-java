Pre-configured template for Java development, containing the following basic components:
1. a Java project skeleton using Bazel
2. The necessary CI workflows which defines the skeleton for tests, distribution tests, and release deployments

# Requirements
- Java
- CircleCI accounts
- Bazel
  - (optional) RBE credential set up in CircleCI
- (optional) [IntelliJ IDEA Bazel plugin](https://plugins.jetbrains.com/plugin/8609-bazel)

# Usage
## Clone the repository:
```
git clone https://github.com/lolski/project-template-java.git
cd project-template-java
```

## Building
Building and running the template:
```
bazel build //:distribution
cd bazel-genfiles/
unzip project-template-java.zip
cd project-template-java/
./run
```

## Testing
Running tests locally:
```
bazel test //...
```

Running tests on RBE:
```
bazel test //... --config=rbe
```

## Adding Maven Dependencies
1. Add the Maven coordinate into `dependencies/maven/dependencies.yaml`
2. Run `./dependencies/maven/update.sh`. If successful, you can expect output that looks like this:
```
./dependencies/maven/update.sh 
INFO: Invocation ID: fce83792-4f71-4f72-b24f-64bf9aa4e4fe
INFO: Build options have changed, discarding analysis cache.
INFO: Analysed target //dependencies/tools:bazel-deps (16 packages loaded, 463 targets configured).
INFO: Found 1 target...
Target //dependencies/tools:bazel-deps up-to-date:
  bazel-bin/dependencies/tools/bazel-deps.jar
  bazel-bin/dependencies/tools/bazel-deps
INFO: Elapsed time: 0.326s, Critical Path: 0.00s
INFO: 0 processes.
INFO: Build completed successfully, 1 total action
INFO: Build completed successfully, 1 total action
wrote 5 targets in 5 BUILD files
```
