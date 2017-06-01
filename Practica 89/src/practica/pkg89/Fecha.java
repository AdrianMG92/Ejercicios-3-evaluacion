/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg89;
import java.time.LocalDate;
/**
 *
 * @author adrian
 */
public class Fecha {
        
        /**
         * Declarar variables
         */
        int dia,mes,año; 
        /**
         * Extrae la fecha local
         */
        LocalDate date=LocalDate.now();
        
        /**
         * Hago el setter
         * @param dia este parametro es para el dia
         */
        public void setdia(int dia){
        this.dia=dia;
        }   
        /**
         * Hago el setter
         * @param mes este parametro es para el mees
         */
        public void setmes(int mes){
            this.mes=mes;
        }
        /**
         * Hago el setter
         * @param año este parametro es para el año
         */
        public void setaño(int año){
            this.año=año;
        }
        
        /**
         * Hago el getter
         * @return dia
         */
        public int getdia(){
        return dia;
        }
        /**
         * Hago el getter
         * @return mes
         */
        public int getmes(){
            return mes;
        }
        /**
         * Hago el getter
         * @return año
         */
        public int getaño(){
            return año;
        }
        
        /**
         * Hago para introducir la fecha
         * @param dia este parametro es para el dia
         * @param mes este parametro es para el mes
         * @param año este parametro es para el año
         */
        public void fechaactual(int dia, int mes, int año){
            this.dia=date.getDayOfMonth();
            this.mes=date.getMonthValue();
            this.año=date.getYear();
            
            
        }
        
        /**
         * Hago las operaciones para la fecha valida
         * @param dia este parametro es para el dia
         * @param mes este parametro es para el mes
         * @param año este parametro es para el año
         */
        public void fechavalida(int dia, int mes, int año){
            /**
             * boolean para controlar el año bisiesto
             */
            boolean bisiesto=false;
            /**
             * boolean para controlar la validez de la fecha
             */
            boolean valido=true;
            /**
             * pongo las condiciones para el año bisiesto y los dias y meses que deben ser para que sale la fecha invalida
             */
            if(año%4==0){
                if(año%100==0 && año%400!=0){
                    
                }
                else{
                    bisiesto=true;
                }
            }
            if (bisiesto==true){
                if((mes==2 && (dia>29 || dia<1)) || ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia<1 || dia>31)) || ((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 || dia>30)) || (mes<1 || mes>12) ){
                    valido=false;
                }
                else{
                    valido=true;
                }
            }
            else{
                if((mes==2 && (dia>28 || dia<1)) || ((mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) && (dia<1 || dia>31)) || ((mes==4 || mes==6 || mes==9 || mes==11) && (dia<1 || dia>30) || (mes<1 || mes>12)) ){
                    valido=false;
                }
                else{
                    valido=true;
                }
            }
            
            if(valido==true){
                System.out.println("La fecha que has introducido es CORRECTA");
            }
            else{
                System.out.println("La fecha que has introducido es ERRÓNEA");
            }
            

         }       
}
