package com.company;

public class L05_Hero {

    private String name;

    public String getName() {
        return name;
    }

    public void attackEnemy(){
        System.out.println("Атакую врага!");
    }

    public class L05_TrainingGround {
        public static void main(String[]args){
            String name = "Добрыня Никитич";
            name.attackEnemy();

        }

    }
}

