package br.edu.ifsp.application.main;


import br.edu.ifsp.application.repository.*;
import br.edu.ifsp.domain.entities.booking.Booking;
import br.edu.ifsp.domain.entities.category.Category;
import br.edu.ifsp.domain.entities.category.CategoryPrice;
import br.edu.ifsp.domain.entities.category.CategoryStatus;
import br.edu.ifsp.domain.entities.room.Room;
import br.edu.ifsp.domain.entities.room.RoomStatus;
import br.edu.ifsp.domain.entities.user.User;
import br.edu.ifsp.domain.entities.user.UserStatus;
import br.edu.ifsp.domain.entities.user.UserType;
import br.edu.ifsp.domain.usecases.booking.*;
import br.edu.ifsp.domain.usecases.category.*;
import br.edu.ifsp.domain.usecases.product.*;
import br.edu.ifsp.domain.usecases.room.*;
import br.edu.ifsp.domain.usecases.user.*;

import java.time.LocalDate;

public class Main {

    private static CreateProductUseCase createProductUseCase;
    private static ListProductsUseCase listProductsUseCase;
    private static UpdateProductUseCase updateProductUseCase;
    private static DisableProductUseCase disableProductUseCase;

    private static CreateRoomUseCase createRoomUseCase;
    private static UpdateRoomUseCase updateRoomUseCase;
    private static DisableRoomUseCase disableRoomUseCase;
    private static ListRoomsUseCase listRoomsUseCase;

    private static CreateCategoryUseCase createCategoryUseCase;
    private static UpdateCategoryUseCase updateCategoryUseCase;
    private static DisableCategoryUseCase disableCategoryUseCase;
    private static ListCategoriesUseCase listCategoriesUseCase;

    private static CreateBookingUseCase createBookingUseCase;
    private static UpDateBookingUseCase upDateBookingUseCase;
    private static FinishBookingUseCase finishBookingUseCase;
    private static ListBookingUseCase listBookingUseCase;

    private static ListBookingByIdUseCase listBookingByIdUseCase;


    private static AutenticationUserUseCase autenticationUserUseCase;

    private static CreateUserUseCase createUserUseCase;

    private static FindUserUseCase findUserUseCase;

    private static RemoveUserUseCase removeUserUseCase;

    private static UpdateUserUseCase updateUserUseCase;


    public static void main(String[] args) {
        configInjections();

        /**----------------Product--------------*/
/*
        // Adiciona produtos
        Product product_1 = new Product("Vinho Tinto", 50.00);
        Product product_2 = new Product("Vinho Espumante", 50.00);
        Product product_3 = new Product("Chocolate", 10.00);
        Product product_4 = new Product("Agua Mineral", 20.00);
        Product product_5 = new Product("Cerveja Lata", 10.00);
        createProductUseCase.insert(product_1);
        createProductUseCase.insert(product_2);
        createProductUseCase.insert(product_3);
        createProductUseCase.insert(product_4);
        createProductUseCase.insert(product_5);

        // Lista um dado produto
        System.out.println(listProductsUseCase.findOne(4));

        System.out.println("##########################################################");

        // Lista todos produtos
        listProductsUseCase.findAll().stream().forEach(product -> System.out.println(product));

        //Altera produto
        product_5.setName("Cerveja Lata Atualizada");
        updateProductUseCase.update(product_5);
        System.out.println(product_5);

        //Desabilita produto
        disableProductUseCase.disableProduct(2);
        // Lista todos produtos
        System.out.println(" ");
        System.out.println("Lista de produtos após a remoção do id 2 e alteração do nome no produto id 5");
        listProductsUseCase.findAll().stream().forEach(product -> System.out.println(product));

 */
        /**---------------Room-----------------*/

       //Adiciona quarto

        Room room101 = new Room(1,101, RoomStatus.AVAILABLE);
        Room room102 = new Room(2,102, RoomStatus.AVAILABLE);
        Room room201 = new Room(3,201, RoomStatus.AVAILABLE);
        Room room202 = new Room(4,202, RoomStatus.AVAILABLE);
        Room room301 = new Room(5,301, RoomStatus.AVAILABLE);
        Room room302 = new Room(6,302, RoomStatus.AVAILABLE);
        createRoomUseCase.insert(room101);
        createRoomUseCase.insert(room102);
        createRoomUseCase.insert(room201);
        createRoomUseCase.insert(room202);
        createRoomUseCase.insert(room301);
        createRoomUseCase.insert(room302);

 /*       //Lista um quarto

        System.out.println(listRoomsUseCase.findOneRoom(4));

        System.out.println("##########################################################");

        //Lista todos quartos

        listRoomsUseCase.findAllRooms().stream().forEach(room -> System.out.println(room));

        //Atualizar quarto

        room302.setNumberRoom(401);
        System.out.println(listRoomsUseCase.findOneRoom(6));

        //Desabilitar quarto

        room301.setRoomStatus(RoomStatus.INACTIVE);
        System.out.println(listRoomsUseCase.findOneRoom(5));
*/

        /**------------Category -----------*/

        //Criar categoria

        Category master = new Category(1,"MASTER", CategoryPrice.ONE_HOUR, CategoryStatus.AVAILABLE);
        master.addRoom(room101);
        master.addRoom(room102);

        Category luxo = new Category(2,"Luxo", CategoryPrice.TWO_HOURS, CategoryStatus.AVAILABLE);
        luxo.addRoom(room201);
        luxo.addRoom(room202);

        Category simples = new Category(3,"Simples", CategoryPrice.ALL_NIGHT, CategoryStatus.AVAILABLE);
        simples.addRoom(room301);
        simples.addRoom(room302);

        createCategoryUseCase.insert(master);
        createCategoryUseCase.insert(luxo);
        createCategoryUseCase.insert(simples);
/*
        //Listar categoria
        System.out.println(listCategoriesUseCase.findOneCategory(2));

        System.out.println("##########################################################");

        listCategoriesUseCase.findAllCategory().forEach(category -> {
            System.out.println(category);
            category.getRoomList().forEach(room -> System.out.println(room));
        });
*/
        //Atualizar categoria

        //Desabilitar Categoria

        /**-------------Booking-----------------*/

        //Cria reserva

        Booking booking1 = new Booking(1,master.selectRoom(0), master.getNameCategory(), LocalDate.of(2023, 5, 1),LocalDate.of(2023, 5, 2), true);

        createBookingUseCase.insert(booking1);

/*
        //Listar reserva

        listBookingUseCase.findOneBooking(0);
        System.out.println("##########################################################");
        System.out.println(booking1);

        //editar reserva

        System.out.println("##########################################################");
        booking1.setRoom(master.selectRoom(1));
        System.out.println(booking1);
        listBookingUseCase.findOneBooking(0);

        //Finaliza reserva

        finishBookingUseCase.finishBooking(booking1.getIdBooking());
*/


        /**-------------User-----------------*/

        User user1 = new User(1, "Ronaldo", "14725836912", "12345", UserType.ADMIN, UserStatus.ACTIVE);
        User user2 = new User(2,"Eduardo","25836978912","1478",UserType.MAINTAINER,UserStatus.ACTIVE);

        createUserUseCase.insert(user1);
        createUserUseCase.insert(user2);

        // Lista um ususario


        // Lista todos usuario
        findUserUseCase.findAll().stream().forEach(user -> System.out.println(user));







        /**-------------Cashier-----------------*/













    }

    private static void configInjections() {
        ProductDAO productDAO = new InMemoryProductDAO();
        createProductUseCase = new CreateProductUseCase(productDAO);
        updateProductUseCase = new UpdateProductUseCase(productDAO);
        listProductsUseCase = new ListProductsUseCase(productDAO);
        disableProductUseCase = new DisableProductUseCase(productDAO);

        RoomDAO roomDAO = new InMemoryRoomDAO();
        createRoomUseCase = new CreateRoomUseCase(roomDAO);
        updateRoomUseCase = new UpdateRoomUseCase(roomDAO);
        disableRoomUseCase = new DisableRoomUseCase(roomDAO);
        listRoomsUseCase = new ListRoomsUseCase(roomDAO);

        CategoryDAO categoryDAO = new InMemoryCategoryDAO();
        createCategoryUseCase = new CreateCategoryUseCase(categoryDAO);
        updateCategoryUseCase = new UpdateCategoryUseCase(categoryDAO);
        disableCategoryUseCase = new DisableCategoryUseCase(categoryDAO);
        listCategoriesUseCase = new ListCategoriesUseCase(categoryDAO);

        BookingDAO bookingDAO = new InMemoryBookingDAO();
        createBookingUseCase = new CreateBookingUseCase(bookingDAO);
        upDateBookingUseCase = new UpDateBookingUseCase(bookingDAO);
        finishBookingUseCase = new FinishBookingUseCase(bookingDAO);
        listBookingUseCase = new ListBookingUseCase(bookingDAO);

        UserDAO userDAO = new InMemoryUserDAO();

        createUserUseCase = new CreateUserUseCase(userDAO);
        autenticationUserUseCase = new AutenticationUserUseCase(userDAO);
        findUserUseCase = new FindUserUseCase(userDAO);
        removeUserUseCase = new RemoveUserUseCase(userDAO);
        updateUserUseCase = new UpdateUserUseCase(userDAO);

    }
}
