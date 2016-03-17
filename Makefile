CC := gcc
CFLAGS := -lm -Wall -Wno-unused-result

VPATH = src:sdk
BUILDDIR = build
BIN = bin

default: checkdirs submission

all: checkdirs datatrim

$(BUILDDIR)/%.o: %.c
	$(CC) -c -o $@ $< $(CFLAGS)

datatrim: build/datatrim.o
	$(CC) -o $(BIN)/datatrim $^ $(CFLAGS)

checkdirs: $(BUILDDIR) $(BIN)

$(BUILDDIR):
	@mkdir -p $@

$(BIN):
	@mkdir -p $@	

clean:
	rm -rf $(BUILDDIR) 
	rm -rf $(BIN)
	rm -f data_*
	rm -f main