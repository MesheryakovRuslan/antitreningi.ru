package lesson3.task5;

import lesson3.task5.Categories.ComputerTechnology;
import lesson3.task5.Categories.GamingConsoles;
import lesson3.task5.Categories.HouseholdAppliances;

public enum Controller {
    MAIN_MENU {
        @Override
        public void action() {
            System.out.println();
            System.out.println("Выберете действие: ");
            System.out.println("1) Главная\t 2) Добавить в корзину\t 3) Перейти в корзину");
        }

        @Override
        public Controller getNextAction(int userSelect) {
            switch(userSelect) {
                case 1:return START_SELECT_CATEGORIES;
                case 2:return ADD_PRODUCTS_CART;
                case 3:return SHOW_CART;
                default:return this;
            }
        }
    },

    START_SELECT_CATEGORIES {
        @Override
        public void action() {
            System.out.println("Выберете категорию электронных товаров:");
            System.out.println("1) ПК");
            System.out.println("2) Игровые консоли");
            System.out.println("3) Домашняя техника");
            System.out.println("4) Все");
        }

        @Override
        public Controller getNextAction(int userSelect) {
            switch (userSelect) {
                case 1:
                    return CATEGORIES_COMPUTER_TECHNOLOGY;
                case 2:
                    return CATEGORIES_GAMING_CONSOLES;
                case 3:
                    return CATEGORIES_HOUSEHOLD_APPLICATION;
                case 4:
                    return CATEGORIES_ALL;
                default:
                    System.out.println("Не верный ввод, попробуйте ещё раз");
                    return START_SELECT_CATEGORIES;
            }
        }
    },

    CATEGORIES_COMPUTER_TECHNOLOGY{
        @Override
        public void action() {
            Technics[] technics;
            Repository repository= new Repository();
            repository.loadPtoducts();
            technics = repository.getTechnics();

            System.out.println();
            System.out.println("Персональные компьютеры:");
            System.out.println();
            for (int i = 0; i < technics.length; i++) {
                if (technics[i] instanceof ComputerTechnology) {
                    System.out.println(technics[i].toString());
                    System.out.println();
                }
            }
            MAIN_MENU.action();
        }

        @Override
        public Controller getNextAction(int userSelect) {
            return MAIN_MENU.getNextAction(userSelect);
        }
    },

    CATEGORIES_GAMING_CONSOLES {
        @Override
        public void action() {
            Technics[] technics;
            Repository repository= new Repository();
            repository.loadPtoducts();
            technics = repository.getTechnics();

            System.out.println();
            System.out.println("Игровые консоли:");
            System.out.println();
            for (int i = 0; i < technics.length; i++) {
                if (technics[i] instanceof GamingConsoles) {
                    System.out.println(technics[i].toString());
                    System.out.println();
                }
            }
            MAIN_MENU.action();
        }

        @Override
        public Controller getNextAction(int userSelect) {
            return MAIN_MENU.getNextAction(userSelect);
        }
    },

    CATEGORIES_HOUSEHOLD_APPLICATION{
        @Override
        public void action() {
            Technics[] technics;
            Repository repository= new Repository();
            repository.loadPtoducts();
            technics = repository.getTechnics();

            System.out.println();
            System.out.println("Домашняя техника:");
            System.out.println();
            for (int i = 0; i < technics.length; i++) {
                if (technics[i] instanceof HouseholdAppliances) {
                    System.out.println(technics[i].toString());
                    System.out.println();
                }
            }
            MAIN_MENU.action();
        }

        @Override
        public Controller getNextAction(int userSelect) {
            return MAIN_MENU.getNextAction(userSelect);
        }
    },

    CATEGORIES_ALL{
        @Override
        public void action() {
            Technics[] technics;
            Repository repository= new Repository();
            repository.loadPtoducts();
            technics = repository.getTechnics();

            System.out.println();
            System.out.println("Все товары:");
            System.out.println();
            for (int i = 0; i < technics.length; i++) {
                System.out.println(technics[i].toString());
                System.out.println();
            }
            MAIN_MENU.action();
        }

        @Override
        public Controller getNextAction(int userSelect) {
            return MAIN_MENU.getNextAction(userSelect);
        }
    },

    ADD_PRODUCTS_CART {
        @Override
        public void action() {
            System.out.println("Введите код товара: ");
        }

        @Override
        public Controller getNextAction(int userSelect) {
            Technics[] technics;
            Repository repository= new Repository();
            repository.loadPtoducts();
            technics = repository.getTechnics();

            for (int i = 0; i < technics.length; i++) {
                if (technics[i].getProductsId() == userSelect) {
                    if(Cart.addProduct(technics[i])) {
                        System.out.println("Товар добавлен");
                    } else {
                        System.out.println("Корзина переполнена");
                    }
                    return MAIN_MENU;
                }
            }
            System.out.println("Товар с таким кодом не найден: " + userSelect);
            return MAIN_MENU;
        }
    },

    SHOW_CART {
        @Override
        public void action() {
            System.out.println();
            System.out.println("Товары в корзине");
            System.out.println();

            int totalSum = 0;
            for (int i = 0; i < Cart.step; i++) {
                System.out.println(Cart.buy[i].toString());
                totalSum += Cart.buy[i].getPrice();
                System.out.println();
            }
            System.out.println("Итоговая сумма: " + totalSum);
            System.out.println();
            System.out.println("Выберете действие: ");
            System.out.println("1) Назад\t 2) Купить");
        }

        @Override
        public Controller getNextAction(int userSelect) {
            switch (userSelect) {
                case 1:
                    return START_SELECT_CATEGORIES;
                case 2:return EXIT;
            }
            return START_SELECT_CATEGORIES;
        }
    },

    EXIT{
        @Override
        public void action() {
            System.out.println("Спасибо за покупку, приходите ещё");
        }

        @Override
        public Controller getNextAction(int userSelect) {
            return null;
        }
    };

    abstract void action();
    abstract Controller getNextAction(int userSelect);
}

