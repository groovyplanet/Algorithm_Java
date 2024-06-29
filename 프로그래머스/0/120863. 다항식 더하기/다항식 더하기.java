class Solution {
	public String solution(String polynomial) {
		String[] arr = polynomial.split(" ");
		int xcount = 0;
		int num = 0;

		for(String x : arr) {
			if(x.contains("x")) {
				xcount += x.equals("x") ? 1: Integer.parseInt(x.replace("x",""));

			}else if(!x.equals("+")) {
				num += Integer.parseInt(x);
			}

		}
		return (xcount != 0 ? (xcount > 1 ? xcount + "x" : "x") : "")
				+ (num != 0 ? (xcount != 0 ? (num > 0 ? " + " : " - ") : "") + Math.abs(num) : (xcount == 0 ? "0" : ""));

	}
}