function minimumAbsoluteDifference(arr) {
    // Sort
    arr.sort();

    let minDiff;

    // Loop through the consecutive pairs, if 0 return, else set min diff
    for (let i = 0; i < arr.length; i++) {
        let absDiff = Math.abs(arr[i+1] - arr[i]);
        if (!minDiff || absDiff < minDiff) minDiff = absDiff;
        if (minDiff === 0) return 0;
    }

    return minDiff;
}
