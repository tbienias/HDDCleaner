load("@rules_java//java:defs.bzl", "java_binary", "java_library")

java_binary(
    name = "HDDCleaner",
    srcs = glob(["src/edu/hda/hddcleaner/main/*.java"]),
    deps = [":ui"],
)

java_library(
    name = "ui",
    srcs = glob(["src/edu/hda/hddcleaner/ui/*.java"]),
    visibility = ["//src/edu/hda/hddcleaner/ui:__pkg__"],
    deps = [":logic"],
)

java_library(
    name = "logic",
    srcs = glob(["src/edu/hda/hddcleaner/logic/*.java"]),
    visibility = ["//src/edu/hda/hddcleaner/logic:__pkg__"],
)
