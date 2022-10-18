from typing import Iterator

class LiczbyPierwsze:
    i: int
    def __iter__(self) -> Iterator[int]:
        if self.i % 1 == self.i and self.i%self.i == 1:
            return self

liczby: LiczbyPierwsze = LiczbyPierwsze()
print(liczby.)