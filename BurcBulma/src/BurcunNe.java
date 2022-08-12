import java.util.Scanner;

public class BurcunNe {
    public static void main(String[] args) {
        int ay, gun;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Hangi ayda doğdunuz?(Rakam ile belirtilmelidir!): ");
        ay = input.nextInt();

        System.out.print("Hangi gün doğdunuz?(Rakam ile belirtilmelidir!): ");
        gun = input.nextInt();

        if (ay <= 12 && ay > 0) {
            if (ay == 1) {
                if (gun > 0 && gun < 32) {
                    if (gun <= 21) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    isError = true;
                }

            }
            if (ay == 2) {
                if (gun > 0 && gun < 28) {
                    if (gun <= 19) {
                        burc = "Kova";
                    } else {
                        burc = "Balık";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 3) {
                if (gun > 0 && gun < 31) {
                    if (gun <= 20) {
                        burc = "Balık";
                    } else {
                        burc = "Koç";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 4) {
                if (gun > 0 && gun < 30) {
                    if (gun < 20) {
                        burc = "Koç";
                    } else {
                        burc = "Boğa";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 5) {
                if (gun > 0 && gun < 31) {
                    if (gun <= 21) {
                        burc = "Boğa";
                    } else {
                        burc = "İkizler";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 6) {
                if (gun > 0 && gun < 30) {
                    if (gun <= 22) {
                        burc = "İkizler";
                    } else {
                        burc = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 7) {
                if (gun > 0 && gun < 31) {
                    if (gun <= 22) {
                        burc = "Yengeç";
                    } else {
                        burc = "Aslan";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 8) {
                if (gun > 0 && gun < 31) {
                    if (gun <= 22) {
                        burc = "Aslan";
                    } else {
                        burc = "Başak";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 9) {
                if (gun > 0 && gun < 30) {
                    if (gun <= 22) {
                        burc = "Başak";
                    } else {
                        burc = "Terazi";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 10) {
                if (gun > 0 && gun < 31) {
                    if (gun <= 22) {
                        burc = "Terazi";
                    } else {
                        burc = "Akrep";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 11) {
                if (gun > 0 && gun < 30) {
                    if (gun <= 21) {
                        burc = "Akrep";
                    } else {
                        burc = "Yay";
                    }
                } else {
                    isError = true;
                }
            }
            if (ay == 12) {
                if (gun > 0 && gun < 31) {
                    if (gun <= 21) {
                        burc = "Yay";
                    } else {
                        burc = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }


        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("Hatali giriş yaptınız.!!!!!");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
