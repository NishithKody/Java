class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String[] temp = strs[i].split("");
            Arrays.sort(temp);
            String val = String.join("",temp);

            if(map.containsKey(val)){
                List<String> arr = map.get(val);
                arr.add(strs[i]);
                map.put(val,arr);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(val,list);
            }
        }

        List<List<String>> res = new ArrayList<>(map.values());

        return res;
        
    }
}
