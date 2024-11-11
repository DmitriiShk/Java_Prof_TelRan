package Lessons.Lesson_5_ENUM.Lesson;

public enum ErrorCode {



    NOT_FOUND(404, "Page not found"),

    FORBIDDEN(403, "Access forbidden"),
    INTERNAL_SERVER_ERROR(500, "Server error"),
    BAD_REQUEST(502, "Bad request");

    int code;
    String message;

    private ErrorCode(int code, String message){
        this.code=code;
        this.message=message;
    }

    public int getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }

    @Override
    public String toString(){
        return "Error code\n Code: " + code + "\n Message: " + message;
    }

}
