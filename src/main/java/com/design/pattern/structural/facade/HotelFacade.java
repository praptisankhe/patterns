package com.design.pattern.structural.facade;

public class HotelFacade {
    private EmailService emailService;
    private PaymentService paymentService;
    private RoomService roomService;

    public HotelFacade(EmailService emailService, PaymentService paymentService, RoomService roomService)
    {
        this.emailService = emailService;
        this.paymentService=paymentService;
        this.roomService = roomService;
    }


    public void bookRoom()
    {
        if(roomService.isRoomAvailable())
        {
            paymentService.makePayment();
            emailService.sendConfirmation();
        }
        else {
            System.out.println("Opps rooms are not available... sorry to hear that");
        }
    }


}
