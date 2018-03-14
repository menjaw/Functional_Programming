;;
;; Exercise
;; This assignment is about implementing map and flat map. Map means going
;; from one list to another and flatten means flattening a list of
;; lists into just a list. Flat map is a combination of both.
;; Your job is to implement map and flat map.
;;

;; Part 1 - Map
;; Map is basically just a function which runs through a list and copies it
;; into a new list. But while copying, it does something to the data. In
;; other words it 'maps' the elements in the original to the new elements in
;; the new list. Your function should take two arguments: a function and a list


;;  ("Have tried to run the code in different ways in the CMD without any luck")
;;("F*** the world!!")

;;The function is testet in CMD and works!! (Jubiiii.....)
(defun add2ToList(lst)
  (mapcar #'(lambda(x) (+ x 2)) lst)
)
(write(add2ToList '(3 5 7 9)))


;;Lets try again with the almost same function (Doesnb't work)
(defun myMap (f l)
 (mapcar #'(lambda(a) (+ a 2)) (list 3 5 7 9))) ;; Should return: (5 7 9 11)
)
(write(myMap))



;; Part 2 - Flattening
;; Flat map is doing two things: it's first taking a list and then flattening
;; all the lists inside that list into one long list. Wait, let's take that
;; again. If you have a list 'l' which have two lists inside:
;;
;; l = [   [1]  ,  [4]   ]
;;         [2]     [5]
;;         [3]     [6]
;;
;; then 'flatten' on 'l' would mean:
;;
;; m = [ 1, 2, 3, 4, 5, 6 ]
;;
;; because all the elements from the first list inside l was laid flat out
;; in the new 'm' list, followed by all the elements from the second list
;; inside l. In the end the order of the new list 'm' should be all the
;; elements from the first list + all the elements from the second list etc.
;;
;; For a flat map operation you need to flatten a list first, so this part
;; is about writing a function that can flatten lists of lists like you
;; saw above. The function should take a list (that contains other lists)
;; as input and return a single, flattened, list as output.
;; Don't try to flatten lists within lists within lists. Just stick to
;; lists within lists and leave any lists in deeper levels.
;;
;; Hint: Use the 'append' function which appends a list to another list

(defun myFlatten (l)
 (append '(123) '(456) l)
)
(write (myFlatten (list (list 1 2 3) (list 4 5 6)))) ;; should be (1 2 3 4 5 6)

;; Part 3 - Flat mapping
;; Combining the mapping and the flattening part, your job now is to do both:
;; flatten the full list while also applying a function to the elements.
;;
;; Hint: Use your 'myMap' function from before to map all elements in a sublist.
