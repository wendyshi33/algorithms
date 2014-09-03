class Solution:
    # @param A, a list of integer
    # @return an integer
    def singleNumber(self, A):
        once = 0         # finally contains the bits appear once
        twice = 0        # finally contains the bits appear twice
        threeTimes = 0   # finally contains the bits appear three times
        for val in A:
            twice |= once & val  # record bits appear twice
            once ^= val        # record bits appear once
            threeTimes = once & twice   # record bits appear three times
            once &= ~threeTimes         # remove bits appear three times
            twice &= ~threeTimes        # remove bits appear three times
            
        return once
