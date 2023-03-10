/**
 * Реализовать класс товар, содержащий следующие свойства:
 * 1. Название
 * 2. Цена
 * 3. Количество
 * 4. Единица измерения
 * А так же реализовать следующие классы-наследники:
 * 1. Продукты питания, содержащие следующие свойства:
 * 1.1 Срок годности
 * 2. Напитки, содержащие следующие свойства:
 * 2.1 Объём
 * 3. Предметы гигиены, содержащие следующие свойства:
 * 3.1 Количество штук в упаковке
 * 4. Детские товары:
 * 4.1 Минимальный возраст
 * 4.2 Гипоаллергенность,
 * А так же реализовать слеюущие классы, наследуемые от приведённых выше
 * классов(надеюсь сами разберётесь от каких именно):
 * 5. Молоко, содержащиее следующее свойство:
 * 5.1 Процент жирности
 * 5.2 Срок годности
 * 6. Лимонад
 * 7. Хлеб, содержащий следующие свойство:
 * 7.1 Тип муки
 * 8. Яйца, содержащее следующиее свойство:
 * 8.1 Количество в упаковке
 * 9. Маски
 * 10. Туалетная бумага, содержащее следующее свойство:
 * 10.1 Количество слоёв
 * 11. Подгузники, содержащие следующее свойства:
 * 11.1 Размер
 * 11.2 Минимальный вес
 * 11.3 Максимальный вес
 * 11.4 Тип
 * 12. Соска
 * У всех классов перегрузить метод ToString класса Object, от которого
 * наследуются все классы, в котором будет происходить вывод всей информации о
 * товаре, так же реализовать конструкторы, принемающие все поля.
 * Реализовать в классе Program, метод выводящий все данные о товаре. Создать в
 * Main все объекты товаров и проверить работу метода, созданного в классе
 * Program
 */

public class Main {
    public static void main(String[] args) {
        Product[][][] products = new Product[][][]{
            new Food[][]{new Bread[]{new Bread("Bread white", 40, 1, "loaf" , "22.03.23", "Wheat"),
                                     new Bread("Bread grey", 45, 1, "loaf", "25.03.23", "Rye")
                                    },
                         new Eggs[]{new Eggs("Chicken eggs", 80, 2, "pack" , "15.03.23", 10),
                                    new Eggs("Quail eggs", 60, 1, "pack", "17.03.23", 10)
                                   }
                        },
            new Drinks[][]{new Milk[]{new Milk("Milk Parmalat", 110, 2, "l", 1.0, 1.8, "19.03.23"),
                                      new Milk("Milk Ekoniva", 115, 1, "l", 1.0, 3.5, "13.03.23")
                                     },
                           new Lemonade[]{new Lemonade("Duchess", 60, 4, "l", 0.5),
                                          new Lemonade("Buratino", 60, 1, "l", 0.5)
                                         }
                          },
            new Hygiene[][]{new Masks[]{new Masks("Green Mask", 190, 1, "ml", 40),
                                        new Masks("Kapous Mask", 70, 5, "g", 25)
                                       },
                            new ToiletPaper[]{new ToiletPaper("Zewa paper", 200, 2, "pack", 4, 4),
                                              new ToiletPaper("Papia paper", 120, 1, "pack", 8, 3)
                                             }
                           },
            new Children[][]{new Diapers[]{new Diapers("Huggies", 320, 3, "pack", 2, true, 50, 4.0, 6.0, "elite soft"),
                                           new Diapers("Pampers", 1300, 1, "pack", 1, true, 94, 2.0, 5.0, "new baby dry")
                                          },
                             new Nipple[]{new Nipple("Nipple Mepsi", 200, 1, "pack", 0, true),
                                          new Nipple("Nipple Lubby Just", 130, 1, "pack", 1, true)
                                         }
                            }
        };

        showAllProducts(products);
    }

    private static void showAllProducts(Product[][][] products) {
        for (Product[][] products2 : products) {
            for (Product[] products3 : products2) {
                System.out.println();
                for (Product products4 : products3) {
                    System.out.printf("\t%s", products4);
                    System.out.println();
                }
            }
        }
    }

}