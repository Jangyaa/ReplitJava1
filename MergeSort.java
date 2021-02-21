public class MergeSort<Comparable> {
    public void merge(Comparable[] dat, Comparable[] aux, int lo, int mid, int hi) {
        for(int i = lo; i <= hi; i++) { aux[i] = dat[i]; } //copy array
        int m = lo, n = mid + 1;
        for(int i = lo; i <= hi; i++) {
            if(m > mid) dat[i] = aux[n++];
            else if(n > hi) dat[i] = aux[n++];
            else if(m > n) dat[i] = aux[n++];
            else dat[i] = aux[m++];
        }
    }
}