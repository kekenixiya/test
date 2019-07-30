package test1;

import java.util.List;

public class Test212121 {
    /**
     * animals : {"dog":[{"name":"Rufus","breed":"labrador","count":1,"twoFeet":false},{"name":"Marty","breed":"whippet","count":1,"twoFeet":false}],"cat":{"name":"Matilda"}}
     */

    private AnimalsBean animals;

    public static void main(String[] args) {
//        String str = "{\"channelNo\":\"hrapi\",\"flowNo\":\"0101021906101135020010001\",\"resData\":\"{\"busiCode\":\"2088\",\"busiMsg\":\"通过，查验一致\",\"carImportCertifition\":\"\",\"carInspectionNumber\":\"\",\"flowNo\":\"0101021906101135020010001\",\"taxpayerNumber\":\"91330109MA27Y6W378\",\"vehicleInvoiceBuyer\":\"徐汉明\",\"vehicleInvoiceBuyerId\":\"330121196406126916\",\"vehicleInvoiceCarModel\":\"\",\"vehicleInvoiceCarVin\":\"LMGHA1G82J1017860\",\"vehicleInvoiceCertId\":\"YJ5699110340207\",\"vehicleInvoiceCode\":\"133001920269\",\"vehicleInvoiceDealer\":\"\",\"vehicleInvoiceEngineId\":\"D086885\",\"vehicleInvoiceIssueDate\":\"2019-06-06\",\"vehicleInvoiceNumber\":\"01081531\",\"vehicleInvoicePriceWithoutTax\":\"72566.37\",\"vehicleInvoiceTotalPrice\":\"82000\"}\"}\"";        System.out.println(str.length());

//        List<String> list  = new ArrayList(); list.add("aaaa");list.add("bbbb");list.add("cccc");
//        System.out.println(JSON.toJSONString(list));
        String asd = "Test212121";
        String str2 = "一致24月以上";
        String str3 = "不一致";

        System.out.println(str3.indexOf("一致"));
    }

    public AnimalsBean getAnimals() {
        return animals;
    }

    public void setAnimals(AnimalsBean animals) {
        this.animals = animals;
    }

    public static class AnimalsBean {
        /**
         * dog : [{"name":"Rufus","breed":"labrador","count":1,"twoFeet":false},{"name":"Marty","breed":"whippet","count":1,"twoFeet":false}]
         * cat : {"name":"Matilda"}
         */

        public CatBean cat;
        private List<DogBean> dog;

        public CatBean getCat() {
            return cat;
        }

        public void setCat(CatBean cat) {
            this.cat = cat;
        }

        public List<DogBean> getDog() {
            return dog;
        }

        public void setDog(List<DogBean> dog) {
            this.dog = dog;
        }

        public static class CatBean {
            /**
             * name : Matilda
             */

            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        public static class DogBean {
            /**
             * name : Rufus
             * breed : labrador
             * count : 1
             * twoFeet : false
             */

            private String name;
            private String breed;
            private int count;
            private boolean twoFeet;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getBreed() {
                return breed;
            }

            public void setBreed(String breed) {
                this.breed = breed;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public boolean isTwoFeet() {
                return twoFeet;
            }

            public void setTwoFeet(boolean twoFeet) {
                this.twoFeet = twoFeet;
            }
        }
    }
}
