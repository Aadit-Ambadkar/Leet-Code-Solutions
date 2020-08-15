#Speed: 12ms (faster than 96.98% of all solutions)
#Memory: 12.9mb (less than 54.01% of all solutions)

#Path Crossing (logic below):

class Solution(object):
    def isPathCrossing(self, path):
        """
        :type path: str
        :rtype: bool
        """
        
        vis = [[0,0]]
        x = 0
        y = 0 
        if path[0]=='N':
            vis.append([0,1])
            y+=1
        elif path[0]=='S':
            vis.append([0,-1])
            y-=1
        elif path[0]=='E':
            vis.append([1,0])
            x+=1
        else:
            vis.append([-1,0])
            x-=1
        
        for i in range(1,len(path)):
            if path[i]=='N':
                if path[i-1]=='S' or [x,y+1] in vis:
                    return True
                else:
                    y+=1
            elif path[i]=='S':
                if path[i-1]=='N' or [x,y-1] in vis:
                    return True
                else:
                    y-=1
            elif path[i]=='E':
                if path[i-1]=='W' or [x+1,y] in vis:
                    return True
                else:
                    x+=1
            else:
                if path[i-1]=='E' or [x-1,y] in vis:
                    return True
                else:
                    x-=1
            vis.append([x,y])
        return False
#Logic:

#1) First, we anaylize the first character, and add both [0,0], and the new position to our visited array.
#2) Next, we loop through all the remaining characters, and check if the path goes back on itself or if the new position is in the visited array. If so, we return True.
#   Otherwise, we increment the x or y as proper, and add it to the visited list. (This code still works without adding the visited list, because of the 76 testcases, 
#   none of them were "NNNESW")
#3) Finally, we return False.
