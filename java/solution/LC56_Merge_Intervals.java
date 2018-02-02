/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() == 0) return new LinkedList<Interval>();
        Collections.sort(intervals, new Comparator<Interval>() {
            public int compare(Interval in1, Interval in2) {
                return in1.start - in2.start;
            }
        });
        List<Interval> res = new LinkedList();
        int curStart = intervals.get(0).start;
        int curEnd = intervals.get(0).end;
        for(Interval in: intervals) {
            if(in.start > curEnd) {
                res.add(new Interval(curStart, curEnd));
                curStart = in.start;
                curEnd = in.end;
            } else {
                // curStart = Math.min(curStart, in.start);
                curEnd = Math.max(curEnd, in.end);
            }
        }
        res.add(new Interval(curStart, curEnd));
        return res;
    }
}