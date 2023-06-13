package geometri;

public class PersegiPanjang {

double panjang, lebar;

public PersegiPanjang(double panjang, double lebar){
    this.lebar = lebar;
    this.panjang = panjang;
    
}
//RUMUS LUAS PERSEGI PANJANG
double Keliling (){
    return panjang * lebar;
}

double Luas (){
    return 2 * (panjang + lebar);
}

}
