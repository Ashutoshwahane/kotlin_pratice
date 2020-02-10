fun main(args: Array<String>){

    var extentionClass_obj = extentionClass()

    extentionClass_obj.skills = "Python"
    extentionClass_obj.show()

    var extentionClass_obj_1 = extentionClass()

    extentionClass_obj_1.skills = "Postgres"
    extentionClass_obj_1.show()


    var extentionClass_obj_plus = extentionClass_obj.plus(extentionClass_obj_1)
    extentionClass_obj_plus.show()

}


fun extentionClass.plus(extClass : extentionClass) : extentionClass{
    var new_extention_class_obj = extentionClass()
    new_extention_class_obj.skills = this.skills+ " " + extClass.skills

    return new_extention_class_obj
}