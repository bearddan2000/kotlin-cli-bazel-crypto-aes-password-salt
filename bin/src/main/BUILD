load("@io_bazel_rules_kotlin//kotlin:kotlin.bzl", "kt_jvm_binary")

kt_jvm_binary (
    name = "BazelApp",
    srcs = glob(["kotlin/**/*.kt"]),
    main_class = "example.MainKt",
    deps = [
      "@maven//:commons_codec_commons_codec",
    ],
)
