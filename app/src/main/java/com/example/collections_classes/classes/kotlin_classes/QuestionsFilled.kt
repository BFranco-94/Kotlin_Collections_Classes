package com.example.collections_classes.classes.kotlin_classes



/** Generic Class instead of 3 classes with the same structure accepting different types of data **/
class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)


class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)