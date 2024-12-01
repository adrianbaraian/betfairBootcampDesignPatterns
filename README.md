# Betfair Bootcamp Design Patterns Assignment
Design Patterns chosen for implementation: `Singleton Pattern` and `Decorator Pattern`.

## Singleton Pattern
The `Publisher` class ensures there is only one instance that handles publishing manga globally.
The `getInstance` method provides access to this instance.

## Decorator Pattern
`Manga` is the base component.
`SpecialEdition` and `BonusChapter` are concrete decorators that dynamically add features to manga objects.

## Flow
Basic manga objects are created first (title-only).
Decorators are applied to enhance manga with features like 'Special Edition' or 'Bonus Chapter'.
The publisher publishes the manga.
The decorated descriptions of the manga are then printed.

## Output
![image](https://github.com/user-attachments/assets/a28c410f-2fdc-47ee-bc38-2c6980f83011)
