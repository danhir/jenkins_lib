def call(cmd) {
    stage 'Trying to do stuff'
    try {
        sh '${cmd}'
    } catch (e) {
        echo "Failed to do stuff. Failure log: ${e}"
    }
}
