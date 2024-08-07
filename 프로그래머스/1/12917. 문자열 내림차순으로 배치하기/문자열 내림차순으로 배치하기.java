import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return s.chars() // 문자열 s의 문자를 intStream으로 변환
            .boxed() // intStream을 Stream<Integer>로 변환
            .sorted((a, b) -> b - a) // 역순으로 정렬
            .map(c -> String.valueOf((char) c.intValue())) // 다시 문자열로 변환
            .collect(Collectors.joining()); // 문자열로 합침
    }
}
