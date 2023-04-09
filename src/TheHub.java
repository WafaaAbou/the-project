public class TheHub {
    Container[][] IDs;

    TheHub() {
        this.IDs = new Container[20][25];

        for(int i = 0; i < 20; ++i) {
            for(int j = 0; j < 25; ++j) {
                this.IDs[i][j] = new Container();
            }
        }

    }

    TheHub(Container[][] contIDS) {
        this.IDs = contIDS;
    }

    public void setContIDs(Container[][] contIDs) {
        this.IDs = contIDs;
    }


    public Container[][] getContIDs() {
        return this.IDs;
    }


    String ToString() {
        String s = "";

        for(int i = 0; i < 20; ++i) {
            for(int j = 0; j < 25; ++j) {
                s = s + this.IDs[i][j].IdNumber + " ";
            }

            s = s + "\n";
        }

        return s;
    }

    int TheStack(Container cont) {
        int i;
        if (cont.Priority == 1) {
            for(i = 19; i >= 0; --i) {
                if (this.IDs[i][0].IdNumber == 0) {
                    this.IDs[i][0].setIdNumber(cont.IdNumber);
                    this.IDs[i][0].setCountry(cont.Country);
                    this.IDs[i][0].setDescription(cont.Description);
                    this.IDs[i][0].setCustomInspection(cont.CustomInspection);
                    this.IDs[i][0].setPriority(cont.Priority);
                    this.IDs[i][0].setReceiverCompany(cont.ReceiverCompany);
                    this.IDs[i][0].setRemitentCompany(cont.RemitentCompany);
                    this.IDs[i][0].setWeight(cont.Weight);
                    System.out.println("Done");
                    return 1;
                }
            }

            if (i == -1) {
                System.out.println("FULL");
                return -1;
            }
        }

        if (cont.Priority== 2) {
            for(i = 19; i >= 0; --i) {
                if (this.IDs[i][1].IdNumber == 0) {
                    this.IDs[i][1].setIdNumber(cont.IdNumber);
                    this.IDs[i][1].setCountry(cont.Country);
                    this.IDs[i][1].setDescription(cont.Description);
                    this.IDs[i][1].setCustomInspection(cont.CustomInspection);
                    this.IDs[i][1].setPriority(cont.Priority);
                    this.IDs[i][1].setReceiverCompany(cont.ReceiverCompany);
                    this.IDs[i][1].setRemitentCompany(cont.RemitentCompany);
                    this.IDs[i][1].setWeight(cont.Weight);
                    System.out.println("Done");
                    return 1;
                }
            }

            if (i == -1) {
                System.out.println("FULL");
                return -1;
            }
        }

        if (cont.Priority != 3) {
            return -1;
        } else {
            i = 9;
            int j = 2;

            for(boolean num = false; j < 25; i = 19) {
                while(i >= 0) {
                    if (this.IDs[i][j].IdNumber == 0) {
                        this.IDs[i][j].setIdNumber(cont.IdNumber);
                        this.IDs[i][j].setCountry(cont.Country);
                        this.IDs[i][j].setDescription(cont.Description);
                        this.IDs[i][j].setCustomInspection(cont.CustomInspection);
                        this.IDs[i][j].setPriority(cont.Priority);
                        this.IDs[i][j].setReceiverCompany(cont.ReceiverCompany);
                        this.IDs[i][j].setRemitentCompany(cont.RemitentCompany);
                        this.IDs[i][j].setWeight(cont.Weight);
                        System.out.println("Done");
                        return 1;
                    }

                    --i;
                }

                ++j;
            }

            return -1;
        }
    }

    void Remove(int column) {
        if (column >= 0 && column <= 24) {
            int i;
            for(i = 0; i < 20; ++i) {
                if (this.IDs[i][column].IdNumber != 0) {
                    this.IDs[i][column] = new Container();
                    System.out.println("Container removed");
                    break;
                }
            }

            if (i == 20) {
                System.out.println("The column is empty");
            }
        } else {
            System.out.println("There is no column");
        }

    }



    int COUNTRIES(String country) {
        int countries = 0;

        for(int i = 0; i < 20; ++i) {
            for(int j = 0; j < 25; ++j) {
                if (this.IDs[i][j].Country == country) {
                    ++countries;
                }
            }
        }

        return countries;
    }
}


