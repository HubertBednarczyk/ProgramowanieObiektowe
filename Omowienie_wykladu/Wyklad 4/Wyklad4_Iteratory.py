from typing import Iterator, List, Any

# class SimpleIterator:
#     i: int
#
#     def __iter__(self) -> Iterator[int]:
#         self.i = 1
#         return self
#
#     def __next__(self) -> int:
#         result: int = self.i
#         self.i += 1
#
#         return result
#
# iter_obj: SimpleIterator = SimpleIterator()
# iterator: SimpleIterator = iter(iter_obj)
#
# print(next(iterator))
# print(next(iterator))
# print(next(iterator))
# print(next(iterator))
# print(next(iterator))

class ListEvenIterator:
    data: List[Any]
    i: int

    def __init__(self, data: List[int]) -> None:
        self.data = data
    def __iter__(self) -> Iterator[Any]:
        self.i = 0
        return self
    def __next__(self) -> Any:
        position: int = self.i
        self.i +=2
        if position >= len(self.data) - 1:
            raise StopIteration
        return self.data[position]

li: List[Any] = ['jeden',2,'trzy','cztery',5.0,6,7,8,9.0,'dziesiec']

list_iter_obj: ListEvenIterator = ListEvenIterator(li)
iterator: ListEvenIterator = iter(list_iter_obj)

for element in iterator:
    print(element)