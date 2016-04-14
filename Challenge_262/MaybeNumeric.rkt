#lang plai

;;MaybeNumeric is a function that returns either a number or a string depending on whether the input (string) is a valid description of a number.
;;sample input (string)
;;
;;  123
;;  44.234
;;  0x123N
;;sample output (any)
;;
;;  123 (number)
;;  44.234 (number)
;;  0x123N (string)

(define MaybeNumeric
  (lambda (String s)
    ( cond ( empty? (read-line s)())
           ( number? (read-line s)("(Number)"))                  