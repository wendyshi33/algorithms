class Solution:
    # @return a string
    def intToRoman(self, num):
        num_list = [('I', 1), ('IV', 4), ('V', 5), ('IX', 9), ('X', 10), 
										('XL', 40), ('L', 50), ('XC', 90), ('C', 100), ('CD', 400), 
										('D', 500), ('CM', 900), ('M', 1000)]
        num_list.reverse()
        s, cur_idx = '', 0
        while num > 0:
            while num < num_list[cur_idx][1]:
                cur_idx += 1
            s += num_list[cur_idx][0]
            num -= num_list[cur_idx][1]
            
        return s
