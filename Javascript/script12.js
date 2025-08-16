function checkPalindrome() {
    var str = document.getElementById("textInput").value
    var cleanStr = str.replace(/[^A-Za-z0-9]/g, '').toLowerCase();
    var reversedStr = cleanStr.split('').reverse().join('');
    if (cleanStr === reversedStr) {
        document.getElementById("result").textContent = `"${str}" is a palindrome ✅`;
    } else {
        document.getElementById("result").textContent = `"${str}" is NOT a palindrome ❌`;
    }
}
