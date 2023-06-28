package ch05;

// 주문정보
// 상거래 시스템의 기본
// 물건구매, 예약, 배달, 중고거래,
// OrderInfo: 소프트웨어 개발자는 데이터/정보를 다루는 사람이다(info)
// 데이터/정보: 문자열, 숫자, 파일(이밎,문서파일)
// xxxInfo, yyyData <---- 쓰지마
// 예약어: 일반적으로 시스템에서 사용하는 용어, 예) order
// PurchaseOrder(구매주문)

// 일반적으로 class는 public 거의
// class 이름은 파스칼케이스(대문자시작단어+대문자시작단어....., pascal-case)
// 그외, kebab-case(order-info, 주소url, 사이트명칭, 컴포넌트이름..., 소문자 단어사이에-)
// snake-case(order_info, 데이터베이스시스템, 단어사이에 underscore를 씀, 단어는 주로 소문자이나, 대문자만으로 한느 경우있음)
// ORDER_INFO
public class OrderInfo {
    // Id(Identification: 신원)
    // 필드(멤버변수, field): 클래스에 선언된 변수를 필드
    // 필드는 자바에서 아주 일반적으로 private을 앞에다가 씀
    // 데이터/정보 1건에 이름/번호를 붙이는 행위는 지극히 당연함
    private String orderId; // 주문번호,
    private String customerName; // 고객명
    private String productName; // 제품명
    private double totalPrice; // 주문금액
    private int quantity; // 주문수량(개수)

    // 메서드(method) 영역
    // 클래스의 기능적인 부분, 실행하고, 수행할 수 있는 단위의 코드
    // 메서드도 일반적으로 앞에 public
    // 메서드도 카멜케이스(camel-case)

    // 클래스명과 동일한 메서드를 생성자(Constructor)
    // 객체(object)를 생성할 때 사용
    // 객체(object, instance)는 클래스로 찍어낸 걸 객체

    public OrderInfo(String orderId, String customerName, String productName, double totalPrice, int quantity) {
        // this라고 하는 것은 현재 객체를 말함
        // this.필드명; 현재 객체의 필드에 접근한다.
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product Name: " + productName);
        System.out.println("Total Price: $" + totalPrice);
        System.out.println("Quantity: " + quantity);
    }

    public void increaseQuantity(int additionalQuantity) {
        quantity += additionalQuantity;
        System.out.println("수량이 추가되었습니다. 총 수량: " + quantity);

        // setter
        // public void set필드명(...)
        //    this.필드명 = 필드명;
        // }
        // 메서드
        // 공개범위(public/private)

    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    // getter: 필드값을 반환할 때 사용
    public String getOrderId(){
//        String temp = this.orderId;
        // return 값을 반환;
        return this.orderId;
    }
    // 메서드 작성형식
    // 아무것도 반환하지 않으면 void
    // 매개변수(parameter): 입력 값에 대해서 형식을 지정
    /* [공개범위(public/private)] [반환타입(String, void)] [메서드이름](매개변수){
         실행되는 코드 ...
         [return 반환값]
         }
     */


}
