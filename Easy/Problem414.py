class Problem414(object):
    def thirdMax(self, nums):
        # :type nums: List[int]
        # :rtype: int
        nodup = list(set(nums));
        nodup.sort()
        if len(nodup)<3: 
            return nodup[-1]
        return nodup[-3]
