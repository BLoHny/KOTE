import java.util.LinkedList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int hit = 0;

        LinkedList<String> cache = new LinkedList<>();

        for (String city : cities) {
            String cityName = city.toUpperCase();

            if (cache.contains(cityName)) {
                hit += 1;
                cache.remove(cityName);
                cache.add(cityName);
            } else {
                hit += 5;
                if (cache.size() == cacheSize && cacheSize > 0) {
                    cache.poll();
                }
                if (cacheSize > 0) {
                    cache.add(cityName);
                }
            }
        }

        return hit;
    }
}
