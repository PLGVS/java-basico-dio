public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 25;
        
        // Ligar e desligar a TV
        public void ligar(){
                ligada = true;
                System.out.println("Ligando a TV...");
        }
        public void desligar(){
                ligada = false;
                System.out.println("Desligando a TV...");
        }

        // Controle de volume
        public void aumentarVolume(){
                volume ++;
                System.out.println("Aumentando o volume para " + volume);
        }
        public void diminuirVolume(){
                volume --;
                System.out.println("Diminuindo o volume para " + volume);
        }

        // Trocar de canal
        public void subirCanal(){
                canal ++;
                System.out.println("Trocando o canal para " + canal);
        }
        public void descerCanal(){
                canal --;
                System.out.println("Trocando o canal para " + canal);
        }

        // Escolher canal
        public void escolherCanal(int novoCanal){
                canal = novoCanal;
                System.out.println("Trocando o canal para " + canal);
        }

}
