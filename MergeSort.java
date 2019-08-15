class MergeSort extends Array {
  void merge (int a[],int l[],int r[]){
    int nl=l.lenght();
    int nr=r.lenght();
    int i=0;
    int j=0;
    int k=0;
    while (i<nl && j<nr){
      if (l[i]<r[j]){
        a[k]=l[i];
        i++;
        k++;
      }else{
        a[k]=r[j];
        k++;
        j++;
      }
    }
    while(i<nl){
      a[k]=l[i];
      k++;
      i++;
    }
    while(j<nr){
      a[k]=r[j];
      k++;
      j++;
    }
  }
  void mergeSort(int a[]){
    int n=a.lenght();
    if (n<2){
      break;
    }
    int mid = n/2;
    int l[]=new int[mid];
    int r[]=new int[n-mid];
    for (int i=0;i<mid-1;i++){
      l[i]=a[i];
    }
    for(int i=0;i<n-mid-1;i++){
      r[i]=a[i];
    }
    mergeSort(l);
    mergeSort(r);
    merge(a,l,r);

  }
}
