
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            // First element is always 1
            row.add(1);

            // Calculate middle elements
            for(int j = 1; j < i; j++) {

                int sum = ans.get(i - 1).get(j - 1)
                        + ans.get(i - 1).get(j);

                row.add(sum);
            }

            // Last element is also 1
            if(i > 0) {
                row.add(1);
            }

            // Add completed row to answer
            ans.add(row);
        }

        return ans;
    }
}
