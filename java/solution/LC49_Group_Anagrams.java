class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<List<String>>();
        Map<String, List<String>> map = new HashMap();
        for(String s : strs) {
            char[] cs = s.toCharArray();
            Arrays.sort(cs);
            String sorted = new String(cs);
            if(map.containsKey(sorted)) {
                map.get(sorted).add(s);
            } else {
                List<String> list = new ArrayList<String>();
                list.add(s);
                map.put(sorted, list);
            }
        }
        
        for(Map.Entry<String, List<String>> entry:map.entrySet()) {
            res.add(entry.getValue());
        }
        return res;
    }
}