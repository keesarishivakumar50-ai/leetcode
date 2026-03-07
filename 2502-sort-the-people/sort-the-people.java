class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        QuickSort(names , heights , 0 , heights.length - 1);
        return names;
    }
    private void QuickSort(String[] names , int[] arr , int low , int high){
        if(low < high){
            int pi = Partition(names , arr , low , high);
            QuickSort(names , arr , low , pi - 1);
            QuickSort(names , arr , pi + 1 , high);
        }
    }
    private int Partition(String[] names , int[] arr , int low , int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low ; j < high ; j++){
            if(arr[j] > pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                String t = names[i];
                names[i] = names[j];
                names[j] = t;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        String t = names[i + 1];
        names[i + 1] = names[high];
        names[high] = t;
        return i + 1;
    }
}