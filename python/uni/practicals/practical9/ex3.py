import random as rand

player = input("Input Rock, Paper, or Scissors: ").strip().upper()
computer = rand.randrange(1, 4)  # Computer: 1 = Rock, 2 = Paper, 3 = Scissors

if computer == 1:
    computer = "ROCK"
elif computer == 2:
    computer = "PAPER"
else:
    computer = "SCISSORS"

if computer == player:
    print("Draw")
elif computer == "ROCK" and player == "SCISSORS":
    print("I win >:D")
elif computer == "SCISSORS" and player == "PAPER":
    print("I win >:D")
elif computer == "PAPER" and player == "ROCK":
    print("I win >:D")
else:
    print("You win :(")

print("Computer: ", computer, " - Player:", player)
