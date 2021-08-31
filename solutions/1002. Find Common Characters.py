class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        
        hash_map = self.count_char(words[0])
        res=[]
        
        for i in range(1, len(words)):
            curr_word = words[i]
            temp_map = self.count_char(curr_word)
            new_map = {}
            
            for key in hash_map:
                if key in temp_map:
                    new_map[key] = min(hash_map[key], temp_map[key])
                    
            hash_map = dict(new_map)
​
        for key in hash_map:
            occure = hash_map[key]
            while occure>0:
                res.append(key)
                occure-=1
        res.sort()
        return res
                
    
    def count_char (self, word):
        hash_map = {}
        for ch in list(word):
            hash_map[ch] = hash_map.get(ch,0)+1
        return hash_map
        
            
