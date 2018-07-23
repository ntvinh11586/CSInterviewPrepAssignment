static String firstRepeatedWord(String s) {

        String[] words = s.split("[ \t,:;.-]");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            if (map.containsKey(key)) {
                int count = map.get(key);
                map.put(key, count + 1);
            } else {
                map.put(key, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value > 1) {
                return key;
            }
        }

        return "";
    }
