fun makeDir(path: String) =
        path.let { File(it) }
            .also { it.mkdirs() }