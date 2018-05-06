/** 
* Устанавливаем принадлежность класса к пакету        com.sanifrey.test1
*/
package com.sanifrey.test1;

/** 
* Импортируем библиотеку
*/
import org.junit.Before;
/** 
* Импортируем библиотеку 
*/
import org.junit.Test;
/** 
* Импортируем библиотеку 
*/
import static org.junit.Assert.assertEquals;

/**
 * Основной класс
 */
public class Formula9Test {
	/**
	 * Объявляем переменную типа Formula
	 */
	private Formula formula;

	/**
	 * Обозначаем , что следующий метод должен быть выполнен перед тестированием
	 */
	@Before
	public void setup() {
		/**
		 * Инициализируем переменную formula
		 */
		formula = new Formula();

	}

	/**
	 * Обозначаем , что следующий метод будет тестируемым
	 */
	@Test
		 /** 
 * Тестируем метод с входными параметрами 119.5, 8.5, 8 и с предполагаемым результатом 51.5 для проверки работы программы с дробными числами.
 * Тестируемый метод выполняет расчёт свободной площади в комнате по формуле: Z=S-a*b.
 * Z - Значение свободной площади в комнате;
 * S - Значение всей площади в комнате, передается первым при вызове метода;
 * a - Значение ширины объекта, передается вторым при вызове метода;
 * b - Значение длины объекта, передается третьим при вызове метода;
 * Предполагается, что программа выполнит следующие расчёты: 119.5-8.5*8 и
 * вернёт значение: 51.5.
 */
	public void testFormula1() {
		/**
		 * Добавляем объект для расчётов при помощи метода PublicAddObject со значением ширины "8.5" и значением длины "8".
		 */
		formula.PublicAddObject( "8.5", "8");
		/**
		 * Выполняем расчёт свободной площади с выше добавленным объектом при значении всей площади "119.5".
		 * Метод assertEquals сравнивает значения, если значения будут разные, то будет ошибка. Предполагается,что
		 * вернёт значение: 51.5
		 */
		assertEquals("51.5",formula.PFormula("119.5"));
		/**
		 * Выполняем удаление всех объектов.
		 */
		formula.PublicDeleteObjects();

	}
}
