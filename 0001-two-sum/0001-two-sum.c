/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numssize, int target, int* returnsize) {
    int *indexarr=(int *)malloc(sizeof(int)*2);
    *returnsize=2;
    for(int i=0;i<numssize;i++)
    {
        for(int j=i+1;j<numssize;j++)
        {
            if(nums[i]+nums[j]==target)
            {
                indexarr[0]=i;
                indexarr[1]=j;
            }
        }
    }
     return indexarr;
}
    
